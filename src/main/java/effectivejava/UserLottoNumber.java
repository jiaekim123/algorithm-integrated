package effectivejava;

import java.util.Hashtable;

public class UserLottoNumber implements LottoNumber {
    private final int number;

    public UserLottoNumber(int number) {
        this.number = number;
    }

    public boolean isSame(LottoNumber lottoNumber) {
        return this.equals(lottoNumber);
    }

    public boolean equals(UserLottoNumber userLottoNumber) {
        if (this == userLottoNumber) return true;
        if (userLottoNumber == null || getClass() != userLottoNumber.getClass()) return false;
        UserLottoNumber that = userLottoNumber;
        return number == that.number;
    }
}
