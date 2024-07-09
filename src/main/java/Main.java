import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class Main {
  public static void main(String[] args) throws Exception {
    String apiKeyAssemblyAI = "";
    String apiKeyOpenAI = "";

    try {
      Properties prop = new Properties();
      String propFileName = "config.properties";

      // Use the class loader to load the properties file
      InputStream inputStream = ClassLoader.getSystemResourceAsStream(propFileName);
      if (inputStream != null) {
        prop.load(inputStream);
        apiKeyAssemblyAI = prop.getProperty("api_key_AssemblyAI");
        apiKeyOpenAI = prop.getProperty("api_key_OpenAI");
      }
      else {
        throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
      }
    } catch (Exception e) {
      System.err.println("Error reading properties file: " + e);
    }

    System.out.println("API Key AssemblyAI: " + apiKeyAssemblyAI);
    System.out.println("API Key OpenAI: " + apiKeyOpenAI);

//    Transcript transcript = new Transcript();
//    transcript.setAudio_url("https://github.com/AssemblyAI-Examples/audio-examples/raw/main/20230607_me_canadian_wildfires.mp3");
//    Gson gson = new Gson();
//    String jsonRequest = gson.toJson(transcript);
//
//    System.out.println(jsonRequest);
//
//    HttpRequest postRequest = HttpRequest.newBuilder()
//      .uri(new URI("https://api.assemblyai.com/v2/transcript"))
//      .header("Authorization", apiKeyAssemblyAI)
//      .POST(BodyPublishers.ofString(jsonRequest))
//      .build();

//    HttpClient httpClient = HttpClient.newHttpClient();

//    HttpResponse<String> postResponse = httpClient.send(postRequest, BodyHandlers.ofString());
//    System.out.println(postResponse.body());
//
//    transcript = gson.fromJson(postResponse.body(), Transcript.class);
//    System.out.println(transcript.getId());
//
//    HttpRequest getRequest = HttpRequest.newBuilder()
//      .uri(new URI("https://api.assemblyai.com/v2/transcript/" + transcript.getId()))
//      .header("Authorization", apiKeyOpenAI)
//      .build();
//
//    while (true) {
//
//      HttpResponse<String> getRespsonse = httpClient.send(getRequest, BodyHandlers.ofString());
//      transcript = gson.fromJson(getRespsonse.body(), Transcript.class);
//      System.out.println(transcript.getStatus());
//
//      if("completed".equals(transcript.getStatus()) || "error".equals(transcript.getStatus())) {
//        break;
//      }
//      Thread.sleep(1000);
//    }
//    System.out.println("Transcription completed");
//    System.out.println(transcript.getText());
//    System.out.println(transcript.getAudio_url());

//    HttpRequest postRequestOpenAI = HttpRequest.newBuilder()
//      .uri(new URI("https://api.openai.com/v1/chat/completions"))
//      .header("Authorization", "Bearer " +  apiKeyOpenAI)
//      .header("Content-Type", "application/json")
//      .POST(BodyPublishers.ofString("    {\n" +
//        "      \"model\": \"gpt-3.5-turbo\",\n" +
//        "      \"messages\": [{\"role\": \"user\", \"content\": \"Give me back 5 random word\"}],\n" +
//        "      \"temperature\": 0.7\n" +
//        "    }"))
//      .build();
//
//    HttpResponse<String> postResponseOpenAi = httpClient.send(postRequestOpenAI, BodyHandlers.ofString());
//    System.out.println(postResponseOpenAi.body());

//    Gson gson = new Gson();
//    OpenAiResponse response = gson.fromJson(postResponseOpenAi.body(), OpenAiResponse.class);
//    System.out.println(response.getChoices()[0].getMessage().getContent());
//    String allWord = response.getChoices()[0].getMessage().getContent();
//    String trimmed = allWord.toLowerCase().trim().replaceAll("\\s+", "").replaceAll("\\d", "");
//    String[] arr = trimmed.split("\\.");
//    System.out.println(trimmed);
//    System.out.println(arr[1]);

  }
}
