public class Main {
    public static void main(String []arg) {
        System.out.println("- Left");
        System.out.println(TextSpace.addSpace(20, "Muhammad", "-", TextSpace.Align.LEFT));
        System.out.println(TextSpace.addSpace(20, "Muflih", "-", TextSpace.Align.LEFT));
        System.out.println(TextSpace.addSpace(20, "Kholidin", "-", TextSpace.Align.LEFT));
        System.out.println();
        System.out.println("- Center");
        System.out.println(TextSpace.addSpace(20, "Muhammad", "-", TextSpace.Align.CENTER));
        System.out.println(TextSpace.addSpace(20, "Muflih", "-", TextSpace.Align.CENTER));
        System.out.println(TextSpace.addSpace(20, "Kholidin", "-", TextSpace.Align.CENTER));
        System.out.println();
        System.out.println("- Right");
        System.out.println(TextSpace.addSpace(20, "Muhammad", "-", TextSpace.Align.RIGHT));
        System.out.println(TextSpace.addSpace(20, "Muflih", "-", TextSpace.Align.RIGHT));
        System.out.println(TextSpace.addSpace(20, "Kholidin", "-", TextSpace.Align.RIGHT));
        System.out.println();
        System.out.println("- Mix");
        System.out.println(
            TextSpace.addSpace(10, "Sate Ayam", " ", TextSpace.Align.LEFT)
            + TextSpace.addSpace(10, "Rp.20000", " ", TextSpace.Align.RIGHT)
        );
    }
}