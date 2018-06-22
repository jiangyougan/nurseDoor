 package com.chance.ssm.utils;
 
 import java.security.MessageDigest;
 
 public class Md5Encrypt
 {
//   private static final char[] DIGITS = { '0', '1', '2', '3', '4', '5', '6', 
//     '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
// 
//   public static String md5(String text)
//   {
//     MessageDigest msgDigest = null;
//     try
//     {
//       msgDigest = MessageDigest.getInstance("MD5");
//     } catch (NoSuchAlgorithmException e) {
//       throw new IllegalStateException(
//         "System doesn't support MD5 algorithm.");
//     }
//     try
//     {
//       msgDigest.update(text.getBytes("utf-8"));
//     }
//     catch (UnsupportedEncodingException e)
//     {
//       throw new IllegalStateException(
//         "System doesn't support your  EncodingException.");
//     }
// 
//     byte[] bytes = msgDigest.digest();
// 
//     String md5Str = new String(encodeHex(bytes));
// 
//     return md5Str;
//   }
// 
//   public static char[] encodeHex(byte[] data)
//   {
//     int l = data.length;
// 
//     char[] out = new char[l << 1];
// 
//     int i = 0; for (int j = 0; i < l; i++) {
//       out[(j++)] = DIGITS[((0xF0 & data[i]) >>> 4)];
//       out[(j++)] = DIGITS[(0xF & data[i])];
//     }
// 
//     return out;
//   }
	 
	 
	 private static final char HEX_DIGITS[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };  
	  
	 private static String toHexString(byte[] b) {  
	     StringBuilder sb = new StringBuilder(b.length * 2);  
	     for (int i = 0; i < b.length; i++) {  
	         sb.append(HEX_DIGITS[(b[i] & 0xf0) >>> 4]);  
	         sb.append(HEX_DIGITS[b[i] & 0x0f]);  
	     }  
	     return sb.toString();  
	 }  
	   
	 public static String Bit32(String SourceString) throws Exception {  
	     MessageDigest digest = java.security.MessageDigest.getInstance("MD5");  
	     digest.update(SourceString.getBytes());  
	     byte messageDigest[] = digest.digest();  
	     return toHexString(messageDigest);  
	 }  
	   
	 public static String Bit16(String SourceString) throws Exception {  
	     return Bit32(SourceString).substring(8, 24);  
	 } 
	 
	 
	 public static void main(String[] args) {
		try {
			System.out.println(Bit16("123456"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 }
