package raiffeisen.sbp.sdk.client;


import raiffeisen.sbp.sdk.exception.SbpException;
import raiffeisen.sbp.sdk.model.Response;
import raiffeisen.sbp.sdk.web.WebClient;

import java.io.IOException;
import java.util.HashMap;

public class PostRequester extends Requester {

    public PostRequester(WebClient client) {
        super(client);
    }

    public Response request(String url, String body, final String secretKey) throws SbpException, IOException {

        HashMap<String, String> headers = prepareHeaders(secretKey);

        Response response = webClient.request("POST", url, headers, body);
        return responseOrThrow(response);
    }
}
