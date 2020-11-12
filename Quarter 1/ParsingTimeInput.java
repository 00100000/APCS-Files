public class ParsingTimeInput {
    public static void main (String[]args) {
        System.out.println(parseTime("10:08 AM")); // 608
        System.out.println(parseTime("6:45 pm")); // 1125
        System.out.println(parseTime("03:12 AM")); // 192
        System.out.println(parseTime(" 7:23 Pm ")); // 1163
        System.out.println(parseTime("444AM")); // 284
        System.out.println(parseTime("0534")); // 334
        System.out.println(parseTime("23:59")); // 1439
        System.out.println(parseTime("800")); // 480
        System.out.println(parseTime("0035")); // 35

        System.out.println("\nAll below should return -1\n");
        
        System.out.println(parseTime("10 08 AM")); // no spaces are permitted in the time portion
        System.out.println(parseTime("4:14 P M")); // no spaces are permitted in the AM/PM portion
        System.out.println(parseTime("006:45 pm")); // time portion must not exceed 4 digits
        System.out.println(parseTime("012:30 am")); // same reason
        System.out.println(parseTime("9:5 PM")); // second part must have 2 digits
        System.out.println(parseTime("102:3")); // misplaced colon
        System.out.println(parseTime("1:47 AMM")); // no extra characters are permitted
        System.out.println(parseTime("PM 7:37")); // the two portions are out of order
        System.out.println(parseTime("4:67 AM")); // the minutes are out of range
        System.out.println(parseTime("2553")); // the hour is out of range
        System.out.println(parseTime("noon")); // nope
    }
    // Dear lord please forgive me for the spaghetti I'm about to write
    // and the breakpoints I'm about to spam
    public static int parseTime(String timeStr) {
        int[] finalArr = {0, 0};
        boolean isPM = false;
        // Starts with weird letter
        if (timeStr.charAt(1) > 58) return -1;
        // AM/PM handling
        timeStr = timeStr.toLowerCase().replace("am", "");
        if (timeStr.toLowerCase().contains("pm")) {
            timeStr = timeStr.toLowerCase().replace("pm", ""); 
            isPM = true;
        }
        timeStr = timeStr.trim();
        // Colon handling
        if (timeStr.contains(":")) {
            try {
                String[] arr = timeStr.split(":");
                // naughty cases
                if (arr[0].length() > 2) return -1;
                if (arr[0].length() == 1) arr[0] = "0" + arr[0];
                if (arr[1].length() > 2 || arr[1].length() < 2) return -1;
                // final numbers
                finalArr[0] = Integer.parseInt(arr[0]) + (isPM ? 12 : 0);
                finalArr[1] = Integer.parseInt(arr[1]);
            } catch (Exception e) {
                return -1;
            }
        // Non-colon handling
        } else {
            try {
                // naughty cases
                if (timeStr.length() > 4) {
                    return -1;
                }
                if (timeStr.length() == 3) {
                    timeStr = "0" + timeStr;
                }
                if (timeStr.length() < 3) {
                    return -1;
                }
                // final numbers
                finalArr[0] = Integer.parseInt(timeStr.substring(0, 2));
                finalArr[1] = Integer.parseInt(timeStr.substring(2, 4));
            } catch (Exception e) {
                return -1;
            }
        }
        // Large number handling
        if (finalArr[0] > 24 || finalArr[0] < 0) {
            return -1;
        }
        if (finalArr[1] > 59 || finalArr[1] < 0) {
            return -1;
        }
        // Special case for something like 24:01
        if (finalArr[0] == 24 && finalArr[1] > 0) {
            return -1;
        }
        return finalArr[0] * 60 + finalArr[1];
    }
}