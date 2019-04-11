/** TextKit.java is a utility class for text methods. This class is apart of the
 * "utils" package. The package contains the method called "lineOfStars" which
 * returns a line of stars as a String. The package also contains the method "pad"
 * that formats a number by adding leading space.
 *
 * @author Luksonne Zetrenne
 *
 */

package utils;

public class TextKit {

    /** The lineOfStars method will print x number of "*" in string format
     *
     * @exception  IllegalArgumentException if <tt>num</tt>
     * @param stars the number of stars to be drawn
     * @return A <tt>String</tt> of stars
     *
     */

    public static String lineOfStars(int stars) throws IllegalArgumentException {

        if (stars < 0)
            throw new IllegalArgumentException("Number of stars to be drawn is " + stars + ", the number should be greater than zero.");

        StringBuilder strBuilder = new StringBuilder(stars);

        for (int i = 0; i < stars; ++i)
            strBuilder.append("*");
        return strBuilder.toString();
    }

    /** The pad method will add leading spaces
     *
     * @exception  IllegalArgumentException if <tt>width</tt>
     * @param num to be padded
     * @param width of leading spaces
     * @return A <tt>String</tt> with num padded
     *
     */

    public static String pad(int num, int width) throws IllegalArgumentException {

        if (width < 0)
            throw new IllegalArgumentException("The width is " + width + ", the width should be greater than zero.");

        StringBuilder padded = new StringBuilder();
        padded.append(num);

        while (padded.length() < width)
            padded.insert(0, " ");
        return padded.toString();

    }
}
