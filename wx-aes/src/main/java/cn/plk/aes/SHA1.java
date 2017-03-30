package cn.plk.aes;

import java.security.MessageDigest;
import java.util.Arrays;

/**
 * 计算公众平台的消息签名接口.
 */
public class SHA1 {

	/**
	 * 用SHA1算法生成安全签名
	 * @param array 字符串数组
	 * @return 安全签名
	 * @throws AesException
	 */
	public static String getSHA1(String... array) throws AesException {
		try {
			// 字符串排序
			Arrays.sort(array);

			// 连接字符串
			StringBuffer sb = new StringBuffer();
			for (String str : array) {
				sb.append(str);
			}
			String str = sb.toString();

			// SHA1签名生成
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			md.update(str.getBytes());
			byte[] digest = md.digest();

			StringBuffer hexstr = new StringBuffer();
			String shaHex = "";
			for (int i = 0; i < digest.length; i++) {
				shaHex = Integer.toHexString(digest[i] & 0xFF);
				if (shaHex.length() < 2) {
					hexstr.append(0);
				}
				hexstr.append(shaHex);
			}
			return hexstr.toString();
		} catch (Exception e) {
			throw new AesException(AesException.ComputeSignatureError);
		}
	}
}
