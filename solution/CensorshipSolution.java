package solution;

import java.util.List;

class CensorshipSolution {

    public static String[] censor(List<String> sentences, String word) {

        String replaced = word.substring(0, 1) + "*".repeat(word.length() - 1);
        return sentences.stream()
                .filter(sentence -> sentence.contains(word))
                .map(sentence -> sentence.replaceAll(word, replaced))
                .toArray(String[]::new);
    }
}