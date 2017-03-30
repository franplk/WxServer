/**
 * 
 */
package cn.plk.manager;

import java.util.Map;

import cn.plk.message.ReplyMsg;

/**
 * @author {康培亮/AB052634}
 *
 */
public interface MsgDeploy {

	public ReplyMsg perform (Map<String, String> xmlMap);
	
}
