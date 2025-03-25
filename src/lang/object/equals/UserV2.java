package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    /*// Object의 equals() 메서드 재정의(매우 간단하게 만듦)
    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; // down casting
        return id.equals(user.id);
    }*/

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        UserV2 userV2 = (UserV2) object;
        return Objects.equals(id, userV2.id);
    }
}
