package com.example.qrcodegenerator.service;

public interface QRCodeService {

    byte[] generateQRCode(String qrContent, int width, int height);

}
