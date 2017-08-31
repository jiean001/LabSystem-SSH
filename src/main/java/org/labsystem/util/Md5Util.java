package org.labsystem.util;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;


/**
 * 安全工具类
 * @author YangJie
 * @createTime 2015年1月21日 下午3:45:07
 */
public class Md5Util {
	
	/**
	 * md5加密字符串
	 * @param str
	 * @return
	 * @author YangJie
	 * @createTime 2015年1月21日 下午3:40:44
	 */
	public final static String md5(String str){
		MessageDigest messageDigest = null;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		messageDigest.update(str.getBytes());
		return Base64.encode(messageDigest.digest());
	}
	
	/**
	 * sha1加密字符串
	 * @param str
	 * @return
	 * @author YangJie
	 * @createTime 2015年1月21日 下午3:40:44
	 */
	public final static String sha1(String str){
		MessageDigest messageDigest = null;
		try {
			messageDigest = MessageDigest.getInstance("SHA-1");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		messageDigest.update(str.getBytes());
		return Base64.encode(messageDigest.digest());
	}

	/**
	 * 使用特定加密范式加密
	 * @param str
	 * @return
	 * @author YangJie
	 * @createTime 2015年1月21日 下午3:56:15
	 */
	public final static String encode(String str){
		return md5(sha1(md5(str)));
	}
	
}
