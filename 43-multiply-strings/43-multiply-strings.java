class Solution {
    public String multiply(String num1, String num2) {
        if (num1.length() < 0 || num2.length() < 0) {
            return "0";
        }
        int[] result = new int[num1.length() + num2.length()];
        for (int j = num1.length()-1; j >= 0; j--) {
            for (int i = num2.length()-1; i>=0; i--)  {
                int firstDigit = num1.charAt(j) - '0';
                int secondDigit = num2.charAt(i) - '0';
                int multiplication = (firstDigit) * (secondDigit);
                int sum = result[i+j+1] + multiplication;
                int carry = sum / 10;
                int rem = sum % 10;
                result[i+j] +=carry;
                result[i+j+1] = rem;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int values:result) {
            if (sb.length() !=0 || values !=0) {
                sb.append(values);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}