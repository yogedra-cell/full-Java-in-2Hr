public class Strings {
    public static void main(String[] args) {

        // Concatenate
        String name1 = "Branha";
        String name2 = "rakshak";
        String name3 = name1 + name2;
        System.out.println(name3);   // Branharakshak

        // charAt
        String name = "Kaushal";
        System.out.println(name.charAt(3)); // s

        // replace
        String address = "Shadananda MP-4";
        String newAddress = address.replace("MP-4", "MP-5");
        System.out.println(newAddress);
    }
}
