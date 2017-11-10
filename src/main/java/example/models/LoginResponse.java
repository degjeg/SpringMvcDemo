package example.models;

/**
 * Created by Administrator on 2017-11-09.
 */
public class LoginResponse extends BaseResponse {
    long uid;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }
}
