// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package qzindustryprinting.actions;

import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import qzindustryprinting.MessageSigner;
import com.mendix.core.Core;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Signs the specified data with the provided private key, returning the RSA SHA1 signature.
 */
public class SignMessage extends CustomJavaAction<String>
{
	private String data;
	private IMendixObject __signingKey;
	private qzindustryprinting.proxies.SigningKey signingKey;

	public SignMessage(IContext context, String data, IMendixObject signingKey)
	{
		super(context);
		this.data = data;
		this.__signingKey = signingKey;
	}

	@Override
	public String executeAction() throws Exception
	{
		this.signingKey = __signingKey == null ? null : qzindustryprinting.proxies.SigningKey.initialize(getContext(), __signingKey);

		// BEGIN USER CODE

		if (this.signingKey == null || this.data == null || this.data.trim().equals("")) {
			return "";
		}
		
		InputStream content = Core.getFileDocumentContent(getContext(),__signingKey);
		byte[] bytes = (content == null) ? null : IOUtils.toByteArray(content);
		
		if (bytes != null) {
			MessageSigner ms = new MessageSigner(bytes);
			return ms.doProcessRequest(this.data);
		} else {
			return "";
		}
		
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "SignMessage";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
