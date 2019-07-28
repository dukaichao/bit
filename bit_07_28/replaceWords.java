package bit_07_28;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:在英语中，我们有一个叫做 词根(root)的概念，它可以跟着其他一些词组成另一个较长的单词——我们称这个词为 继承词(successor)。例如，词根an，跟随着单词 other(其他)，可以形成新的单词 another(另一个)。
 *
 * 现在，给定一个由许多词根组成的词典和一个句子。你需要将句子中的所有继承词用词根替换掉。如果继承词有许多可以形成它的词根，则用最短的词根替换它。
 *
 * 你需要输出替换之后的句子。
 *
 * 示例 1:
 *
 * 输入: dict(词典) = ["cat", "bat", "rat"]
 * sentence(句子) = "the cattle was rattled by the battery"
 * 输出: "the cat was rat by the bat"
 *
 *
 * User:Mr.Du
 * Date:2019/7/28
 * Time:10:07
 */
public class replaceWords {

    static class Trie {

        static class TrieNode {
            boolean word;
            TrieNode[] children;

            TrieNode(boolean word) {
                this.word = word;
                this.children = new TrieNode[26];
            }

            TrieNode() {
                this(false);
            }
        }

        private TrieNode root;

        /**
         * Initialize your data structure here.
         */
        Trie() {
            this.root = new TrieNode();
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert(String word) {
            if (word == null || Objects.equals(word.trim(), "")) {
                return;
            }
            TrieNode cur = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (cur.children[index] == null) {
                    cur.children[index] = new TrieNode(false);
                }
                cur = cur.children[index];
            }
            cur.word = true;
        }



        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("cat");
            list.add("bat");
            list.add("rat");
            String s = "the cattle was rattled by the battery";
            System.out.println(replaceWords(list,s));
        }

        public static String replaceWords(List<String> dict, String sentence) {
            Trie trie = new Trie();
            for (String s : dict) {
                trie.insert(s);
            }
            String[] words = sentence.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String word : words) {
                String replace = trie.search(word);
                if (replace != null) {
                    sb.append(replace).append(" ");
                } else {
                    sb.append(word).append(" ");
                }
            }
            return sb.toString().trim();
        }

        /**
         * Returns if the word is in the trie.
         */
        public String search(String word) {
            if (word == null || Objects.equals(word.trim(), "")) {
                return null;
            }
            TrieNode cur = root;
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (cur.children[index] == null) {
                    return null;
                }
                sb.append(c);
                cur = cur.children[index];
                if (cur.word) {
                    return sb.toString();
                }
            }
            return null;
        }


    }
}
