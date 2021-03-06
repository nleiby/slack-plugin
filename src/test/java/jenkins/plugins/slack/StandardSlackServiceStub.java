package jenkins.plugins.slack;

public class StandardSlackServiceStub extends StandardSlackService {

    private CloseableHttpClientStub httpClientStub;

    public StandardSlackServiceStub(String baseUrl, String teamDomain, String token, String tokenCredentialId, boolean botUser, String roomId) {
        super(baseUrl, teamDomain, token, tokenCredentialId, botUser, roomId);
    }

    @Override
    public CloseableHttpClientStub getHttpClient() {
        return httpClientStub;
    }

    public void setHttpClient(CloseableHttpClientStub httpClientStub) {
        this.httpClientStub = httpClientStub;
    }
}
