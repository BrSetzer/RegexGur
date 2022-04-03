
public class Loader {
    public static void main(String[] args) {
        //String text = "Alfred Alvarez was born in London, to an English mother and father of Spanish descent.\n" +
        // "He was educated at The Hall School in Hampstead, London, and then Oundle School and Corpus Christi College,\n" +
        //  "Oxford, where he took a First in English. He was subsequently elected as a Jane Eliza Procter Visiting\n" +
        //  "Fellow at Princeton University. After teaching briefly in Oxford and the United States, he became a\n" +
        //  "full-time writer in his late twenties. From 1956 to 1966, he was the poetry editor and critic for\n" +
        //  "The Observer, where he introduced British readers to John Berryman, Robert Lowell, Sylvia Plath. Alvarez\n" +
        //  "is the author of many non-fiction books. He is best known for his study of suicide,\n" +
        //  "The Savage God, which gained added resonance from his friendship with Plath.";

        String text = "You can write letter here login@mail.org";

        String[] elements = text.split("[\\s\\\\/()\\[\\]\"-]+");
        for (String element : elements) {
            element = element.replaceAll("[.,!?&:;]+&", "");
            if (element.matches("[A-Za-z][a-z]*|[A-Z]+")) {
                System.out.println(element);
            } else {
                String newElement = element.replaceAll("'", "");
                if (newElement.matches("[A-Za-z]+"))
                    System.out.println(element + " (probably contraction/concatenation");
            }
        }
    }
}
