public class TextSpace {
    class Align {
        public static final String LEFT = "LEFT";
        public static final String CENTER = "CENTER";
        public static final String RIGHT = "RIGHT";
    }

    public static String addSpace(int length, String text, String separator, String align) {
        int textLength = text.length();
        String space = "";
        for(int i = textLength; i < length; i ++) {
            space += separator;
        }
        switch(align) {
            case Align.LEFT:
                return text + space;
            case Align.RIGHT:
                return space + text;
            case Align.CENTER:
                int spaceLength = space.length();
                int part = (int)Math.floor(spaceLength / 2);
                return space.substring(0, part) + text + space.substring(part);
        }
        return "";
    }
}