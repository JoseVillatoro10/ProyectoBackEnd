package com.ejemplo.backendapp.auth;

public class JwtConfig {
    public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";

    public static final String RSA_PRIVADA ="-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEowIBAAKCAQEApwgiIlWpYccKLn71O4CGJdDPebub49K9Ry+YncP0s4wzZTun\n" +
            "W44jzRfnMQKsOi8TOw7EkJJZJ0nkBvMqZO/1pzGzWtzsvgcXITH0t5460D56pW3p\n" +
            "etvdA67ZSjjOY000tthJMefsDvUGpYTT9NM6G0tvAemCTTY7gFYYtcA3dwbwFBbZ\n" +
            "mZJNvQXXwOP6s/TlG+FrTO35qW14kLh5r/elNgjdl2NERPajUfgXd1f+Hh1U1QeR\n" +
            "vrtkQj4bvHHvNMw+RYJIC/OL920qqjKv+egrKxkjdWp5YLaoZMQIjdfyadWnyO+t\n" +
            "WUaEC7s9L20oYZzTT4A5mUAb2dEH2jqx3sxnbQIDAQABAoIBAHz8iQ5IK0cPOX8x\n" +
            "YS/1LGx/o8DjsfL4bsolw33KdAEmmA7YZJMN+ZwulsEFzvp631kB4/SKjkvn7smE\n" +
            "i+Sb6qYBesQzLLPFenlMeGIt9LR/DCdd56gXfXqUC+SOPWHxE9D+Z0cA1JMcpqyU\n" +
            "iEZbCNAD0j0MDoTYYA3YXwUhoF9fjBKrvIZzf85gfCl/MIJ7KUhJPKZABWd0aJ8w\n" +
            "28h59AJWFTsfloGJd2TJYR2peNQjAliiOMfNCICdIe3fByuWM0ji/9mIXcdTzENX\n" +
            "Zy+V+lz6AWf3s2B1J+0iYWw8frIqcGKsANXhbtvrbSjp8XC0AuhPWywDUVC+Optu\n" +
            "uocNG8ECgYEA1EcLbB/c9OC2kUHiainJP7THy8HrdOrzQSbIAfy1IM+FsA+yAZJv\n" +
            "MxYamFhV9VhMMoCuhY+8CSNn+Ye8C6mdAO2LHy7aMsiX2Ok42p6McwbgxuYeTviG\n" +
            "t3crARYkO1v8Gh/1z9rYFDRK+81aACD912BDcd07owMzSXal0pthRcMCgYEAyW9f\n" +
            "tQs02uWprS2YRcb/kVbMwXTPV1oH30cPeyjUyROFT1nQEn+Ua+ZVPRnGMowKUF+u\n" +
            "5wv4gWL2XEfqe4BXFheelDWsur17w2RpndxVZzEPXCHAHuvxa/JOCE9e9wpLTJw3\n" +
            "PJ4TNE2SHl0xgXvPk3czvdG90zCS0422VYCvWw8CgYBy5GzzPZ+qzkEiB4XTLgCl\n" +
            "wWPuDWwyIMQ+PA4+vRcPxiI2c5hFr4sOHGWSlSUZIIxFPU64LV55l7c74FJQAaJf\n" +
            "kTIeU453tAgzt6807GFaFJvuKzi2R18qx434DZLYqeWeAjRaJrmS3ebDuJaAwVqC\n" +
            "irCWXUZc6WuF1HjVr5GLXwKBgF6bDFw/UyerzbEkROwgtk9QcQI7FlZ0VlYrTb4O\n" +
            "Q0HdBTNrfynw+YhjuYzk2g1LcFynU8H4AVLjY8mbjSlL8ZrSpQv+2Y0rCUGPm3sk\n" +
            "zIeWpxwiTdU4Az8rojKM9JEaKJtmkxrJM0PRWtsf8exadfdQeOCh7YGOwqbRW910\n" +
            "fudJAoGBAMW+RD3tzvd1zmX76jy4/kplTcsNuZFN4Jo5vYjQjRSXF+B6EfxXgXQ4\n" +
            "7gRk0J/p0hM+yVmZ+KCJ1iPli80n5yjvYJ4unB8zsc4dW4+IjWSqvZx49s4kGemh\n" +
            "7aXFlqJUY6oMZ8OKd0mueHcth4sr1ZOzPDqFZTyuZvF4y/2hkF8X\n" +
            "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApwgiIlWpYccKLn71O4CG\n" +
            "JdDPebub49K9Ry+YncP0s4wzZTunW44jzRfnMQKsOi8TOw7EkJJZJ0nkBvMqZO/1\n" +
            "pzGzWtzsvgcXITH0t5460D56pW3petvdA67ZSjjOY000tthJMefsDvUGpYTT9NM6\n" +
            "G0tvAemCTTY7gFYYtcA3dwbwFBbZmZJNvQXXwOP6s/TlG+FrTO35qW14kLh5r/el\n" +
            "Ngjdl2NERPajUfgXd1f+Hh1U1QeRvrtkQj4bvHHvNMw+RYJIC/OL920qqjKv+egr\n" +
            "KxkjdWp5YLaoZMQIjdfyadWnyO+tWUaEC7s9L20oYZzTT4A5mUAb2dEH2jqx3sxn\n" +
            "bQIDAQAB\n" +
            "-----END PUBLIC KEY-----";
}