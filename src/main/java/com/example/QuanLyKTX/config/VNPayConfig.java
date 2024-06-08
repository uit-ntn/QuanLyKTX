package com.example.QuanLyKTX.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import java.util.Objects;

@Configuration
@ConfigurationProperties(prefix = "vnpay")
public class VNPayConfig {
    private String tmnCode;
    private String hashSecret;
    private String url;


    public VNPayConfig() {
    }

    public VNPayConfig(String tmnCode, String hashSecret, String url) {
        this.tmnCode = tmnCode;
        this.hashSecret = hashSecret;
        this.url = url;
    }

    public String getTmnCode() {
        return this.tmnCode;
    }

    public void setTmnCode(String tmnCode) {
        this.tmnCode = tmnCode;
    }

    public String getHashSecret() {
        return this.hashSecret;
    }

    public void setHashSecret(String hashSecret) {
        this.hashSecret = hashSecret;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VNPayConfig tmnCode(String tmnCode) {
        setTmnCode(tmnCode);
        return this;
    }

    public VNPayConfig hashSecret(String hashSecret) {
        setHashSecret(hashSecret);
        return this;
    }

    public VNPayConfig url(String url) {
        setUrl(url);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof VNPayConfig)) {
            return false;
        }
        VNPayConfig vNPayConfig = (VNPayConfig) o;
        return Objects.equals(tmnCode, vNPayConfig.tmnCode) && Objects.equals(hashSecret, vNPayConfig.hashSecret) && Objects.equals(url, vNPayConfig.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tmnCode, hashSecret, url);
    }

    @Override
    public String toString() {
        return "{" +
            " tmnCode='" + getTmnCode() + "'" +
            ", hashSecret='" + getHashSecret() + "'" +
            ", url='" + getUrl() + "'" +
            "}";
    }
}
