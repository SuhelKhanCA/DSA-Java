class ModifyStringDemo {

    public static void main(String args[]) {
        StringBuffer text = new StringBuffer("Data Structure ");
        text.append("C++");
        System.out.print(text);
        
        text.insert(15, "with ");
        System.out.print(text);
        
        text.replace(20, 23, "Java");
        System.out.print(text);
        
        text.delete(14, 19);
        System.out.print(text);
    }
}
