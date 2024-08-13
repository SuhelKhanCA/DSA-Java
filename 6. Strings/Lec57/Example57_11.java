// Example 57.11: String to Float
class StringToFloatDemo {
    public static void main(String[] args) {
        String number = "95.59";
        float num = Float.parseFloat(number);
        float output = num + 4.41f;
        System.out.println(output);
    }
}
