public class OpenAiResponse {
    private String id;
    private String model;
    private Choice[] choices;

    public String getId() {
      return id;
    }

    public String getModel() {
      return model;
    }

    public Choice[] getChoices() {
      return choices;
    }
}
