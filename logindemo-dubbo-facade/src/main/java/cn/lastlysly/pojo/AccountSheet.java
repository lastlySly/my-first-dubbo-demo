package cn.lastlysly.pojo;

import java.io.Serializable;

public class AccountSheet implements Serializable {
    private Long accountId;

    private String accountUsername;

    private Double accountMoney;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountUsername() {
        return accountUsername;
    }

    public void setAccountUsername(String accountUsername) {
        this.accountUsername = accountUsername == null ? null : accountUsername.trim();
    }

    public Double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(Double accountMoney) {
        this.accountMoney = accountMoney;
    }
}