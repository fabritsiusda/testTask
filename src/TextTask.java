import java.util.*;

public class TextTask {

    private String text;

    private List<TextHelper> list;

    public void setText(String text) {
        this.text = text;
        Map<String, TextHelper> map  = new HashMap<>();
        String[] array = text.split("\\s");
        for (String word : array){
            word = word.replaceAll("\\W", "")
                    .toLowerCase().trim();

            if (!word.isEmpty()){
                if (map.containsKey(word)){
                    map.get(word).addCount();
                } else {
                    map.put(word, new TextHelper(word));
                }
            }
        }
        list = new ArrayList<>();
        list.addAll(map.values());
        Collections.sort(list);
    }

    public void showWords(){
        if (list == null)
            return;
        for (TextHelper helper : list){
            System.out.println(helper.getWord() + " => " + helper.getCount());
        }
    }
}
