

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import java.io.IOException;

public class GeekHttpClient {

    public static void main(String[] args) throws IOException {
        final String url = "http://127.0.0.1:8801";
        OkHttpClient client = new OkHttpClient();

        final Request request = new Request.Builder()
                .url(url)
                .build();
        final Call call = client.newCall(request);
        Response response = call.execute();
        System.out.println(response.body().toString());
    }
}
