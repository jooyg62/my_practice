package com.jgseo.base64EncDec;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodingDecoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// String -> encoding -> String
		String msg = "장규님이 입장하셧습니다.";
		byte[] msgBytes = msg.getBytes("utf-8");
		
		//Base64  코딩
		Encoder encoder = Base64.getEncoder();
		
		// 바이트 배열 반환
		byte[] encodedMsg = encoder.encode(msgBytes);
		System.out.println(new String(encodedMsg));
		
		// 문자열 반환
		String encodedMsgString = encoder.encodeToString(msgBytes);
		System.out.println(encodedMsgString);
		
		
		// Base64 코딩
		Decoder decoder = Base64.getDecoder();
		byte[] decodebytes = decoder.decode(encodedMsg);
		byte[] decodebytesString = decoder.decode(encodedMsgString);
		
		//  코딩  문자     
		String result1 = new String(decodebytes, "utf-8");
		String result2 = new String(decodebytesString, "utf-8");
		
		System.out.println("result1: " + result1);
		System.out.println("result1: " + result2);
		
		// test..
		String str = "L3cgamdzZW8g";
		byte[] decodedStr = decoder.decode(str);
		System.out.println("result decodedStr: " + new String(decodedStr, "utf-8"));
		
	}

}
