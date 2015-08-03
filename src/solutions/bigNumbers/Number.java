package solutions.bigNumbers;

public enum Number
{
    N0(new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "}),
    N1(new String[]{
            "  *  ",
            " **  ",
            "  *  ",
            "  *  ",
            " *** "}),
    N2(new String[]{
            " *** ",
            "*   *",
            "   * ",
            " *   ",
            "*****"}),
    N3(new String[]{
            " *** ",
            "    *",
            "  ** ",
            "    *",
            " *** "}),
    N4(new String[]{
            "   * ",
            " * * ",
            "**** ",
            "   * ",
            "   * "}),
    N5(new String[]{
            "**** ",
            "*    ",
            "**** ",
            "   * ",
            "**** "}),
    N6(new String[]{
            " *** ",
            "*    ",
            "**** ",
            "*   *",
            " *** "}),
    N7(new String[]{
            "**** ",
            "   * ",
            "   * ",
            "  *  ",
            " *   "}),
    N8(new String[]{
            " *** ",
            "*   *",
            " *** ",
            "*   *",
            " *** "}),
    N9(new String[]{
            " *** ",
            "*   *",
            " ****",
            "    *",
            " *** "});

    Number(String[] sequence)
    {
        this.sequence = sequence;
    }

    private String[] sequence;

    //TODO get enums through reflection

    public static String[] returnNumber(char c)
    {
        String[] sequence = {};

        switch (c)
        {
            case '0':
                sequence = N0.getSequence();
                break;
            case '1':
                sequence = N1.getSequence();
                break;
            case '2':
                sequence = N2.getSequence();
                break;
            case '3':
                sequence = N3.getSequence();
                break;
            case '4':
                sequence = N4.getSequence();
                break;
            case '5':
                sequence = N5.getSequence();
                break;
            case '6':
                sequence = N6.getSequence();
                break;
            case '7':
                sequence = N7.getSequence();
                break;
            case '8':
                sequence = N8.getSequence();
                break;
            case '9':
                sequence = N9.getSequence();
                break;
        }
        return sequence;
    }

    public String[] getSequence()
    {
        return sequence;
    }
}
