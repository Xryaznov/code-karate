package codingBat.warmUp1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StartOz {
    /**
     * Given a string, return a string made of the first 2 chars (if present),
     * however include first char only if it is 'o' and include the second only if it is 'z',
     * so "ozymandias" yields "oz".
     * <p>
     * startOz("ozymandias") → "oz"
     * startOz("bzoo") → "z"
     * startOz("oxx") → "o"
     */


    public String startOz(String str) {
        for (char c : str.toCharArray()) {
            if (!(String.valueOf(c).equals("z") || String.valueOf(c).equals("o"))) {

                String st = str.substring(0, 2);

                if (st.contains("o") && st.contains("z")) {
                    return st;
                }
                else if (st.contains("o")) {
                    return "o";
                }
                else if (st.contains("z")) {
                    return "z";
                }
            }
        }

        return str;
    }

        @Test
        public void startOzTest1 () {
            assertEquals("oz", startOz("ozymandias"));
        }

        @Test
        public void startOzTest2 () {
            assertEquals("z", startOz("bzoo"));
        }

        @Test
        public void startOzTest3 () {
            assertEquals("o", startOz("oxx"));
        }

        @Test
        public void startOzTest4 () {
            assertEquals("zoo", startOz("zoo"));
        }


    }
