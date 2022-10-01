public class string_builder 
{
    public static void main(String[] args) 
    {
        StringBuilder sb = new StringBuilder("Khush");
        System.out.println(sb);

        // // char at index 0 --- prints the letter 
        // System.out.println(sb.charAt(0));

        // // set char at index 0 --- replace the letter(Phush)
        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // // insert function --- add letter on any position(KhuKsh)
        // sb.insert(3, 'K');
        // System.out.println(sb);

        // delete the extra 'K' --- delete letter(hush)
        // sb.delete(0, 1);
        // System.out.println(sb);

        // append function --- add anything at the end(KhushP)
        // sb.append("P");
        // System.out.println(sb);

        // function lenght --- prints length 
        // System.out.println(sb.length());
    }    
}
