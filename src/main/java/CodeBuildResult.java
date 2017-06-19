import org.jenkinsci.plugins.scriptsecurity.sandbox.whitelists.Whitelisted;

import java.io.Serializable;

public class CodeBuildResult implements Serializable {
    public static String IN_PROGRESS = "IN_PROGRESS";
    public static String SUCCESS = "SUCCESS";
    public static String FAILURE = "FAILURE";
    private String status = IN_PROGRESS;
    private String errorMessage;
    private String buildId;
    private String arn;


    @Whitelisted
    public String getStatus() {
        return status;
    }

    @Whitelisted
    public String getErrorMessage() {
        return errorMessage;
    }

    @Whitelisted
    public String getBuildId() {
        return buildId;
    }

    @Whitelisted
    public String getArn() {
        return arn;
    }

    public void setFailure(String errorMessage){
        this.status = FAILURE;
        this.errorMessage = errorMessage;
    }

    public void setSuccess() {
        this.status = SUCCESS;
    }

    public void setBuildInformation(String buildId, String arn) {
        this.buildId = buildId;
        this.arn = arn;
    }
}
