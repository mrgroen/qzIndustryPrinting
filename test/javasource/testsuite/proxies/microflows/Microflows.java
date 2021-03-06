// This file was generated by Mendix Modeler 6.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testsuite.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the TestSuite module
	public static java.util.List<testsuite.proxies.Color> dSL_Color(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			java.util.List<IMendixObject> objs = Core.execute(context, "TestSuite.DSL_Color", params);
			java.util.List<testsuite.proxies.Color> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<testsuite.proxies.Color>();
				for (IMendixObject obj : objs)
					result.add(testsuite.proxies.Color.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<testsuite.proxies.Color> dSL_Colors(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			java.util.List<IMendixObject> objs = Core.execute(context, "TestSuite.DSL_Colors", params);
			java.util.List<testsuite.proxies.Color> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<testsuite.proxies.Color>();
				for (IMendixObject obj : objs)
					result.add(testsuite.proxies.Color.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static testsuite.proxies.Color dSO_Color(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "TestSuite.DSO_Color", params);
			return result == null ? null : testsuite.proxies.Color.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_Commit(IContext context, testsuite.proxies.Color _employee)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Employee", _employee == null ? null : _employee.getMendixObject());
			Core.execute(context, "TestSuite.IVK_Commit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean iVK_CustomWidgetOnclick(IContext context, testsuite.proxies.Color _employee)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Employee", _employee == null ? null : _employee.getMendixObject());
			return (Boolean)Core.execute(context, "TestSuite.IVK_CustomWidgetOnclick", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_OpenCashDrawer(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "TestSuite.IVK_OpenCashDrawer", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_PrintReceiptAndOpenCashDrawer(IContext context)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			Core.execute(context, "TestSuite.IVK_PrintReceiptAndOpenCashDrawer", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_RefreshInClient(IContext context, testsuite.proxies.Color _employee)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Employee", _employee == null ? null : _employee.getMendixObject());
			Core.execute(context, "TestSuite.IVK_RefreshInClient", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ShowValidations(IContext context, testsuite.proxies.Color _employee)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Employee", _employee == null ? null : _employee.getMendixObject());
			Core.execute(context, "TestSuite.IVK_ShowValidations", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void oCh_Color(IContext context, testsuite.proxies.Color _employee)
	{
		try
		{
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("Employee", _employee == null ? null : _employee.getMendixObject());
			Core.execute(context, "TestSuite.OCh_Color", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}