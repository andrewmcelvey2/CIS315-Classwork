
/**
 * Pass by value vs. reference.
 * 
 * Java ALWAYS uses pass-by-value.  But you need to pay attention to the
 * value type (primitive vs. object reference).
 * 
 * @author John Crabtree
 */
public class PassByValue {
    
    /**
     * Swap block objects.
     *
     * Java passes object references by value.  This method does not have 
     * any lasting effect, while a C++ method using the reference operator 
     * or a C# method using "ref" would result in a lasting swap.
     */
    static void swap(Block var1, Block var2) {
        Block temp = var1;
        var1 = var2;
        var2 = temp;
    }
    
    /**
     * Change a Block into a cube.
     *
     * This change does not persist either since it changes the object 
     * reference "b", which was passed by value, thus changing the copy
     * on the stack only.
     */
    static void cubify(Block b, int dim) {
        b = new Block(dim, dim, dim);
    }
    
    /**
     * Change a Block into a cube.
     *
     * This change DOES persist since we are not changing the object reference,
     * but the values within the object on the heap.
     */
    static void cubifyObject(Block b, int dim) {
        b.setHeight(dim);
        b.setWidth(dim);
        b.setDepth(dim);
    }

    public static void main(String[] args) {
        Block b1 = new Block(1, 2, 3);
        Block b2 = new Block(2, 2, 2);
        
        System.out.println(b1);
        System.out.println(b2);
        
        swap(b1, b2);
        
        System.out.println(b1);
        System.out.println(b2);
        
        cubify(b1, 7);
        
        System.out.println("after cubify");
        System.out.println(b1);
        
        cubifyObject(b1, 7);
        
        System.out.println("after cubifyObject");
        System.out.println(b1);
    }
}

class Block {
    private int height, width, depth;
    
    public Block(int h, int w, int d) {
        height = h;
        width = w;
        depth = d;
    }
    
    public void setDepth(int depth) {
        this.depth = depth;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    
    public String toString() {
        return "" + height + " x " + width + " x " + depth;
    }
}
