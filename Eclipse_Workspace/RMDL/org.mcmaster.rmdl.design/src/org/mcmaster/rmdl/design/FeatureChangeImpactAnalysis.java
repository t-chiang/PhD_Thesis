package org.mcmaster.rmdl.design;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;

public class FeatureChangeImpactAnalysis extends AbstractExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		// TODO Auto-generated method stub
		System.out.println("-------------Start Change Impact Analysis-------------");
		System.out.println("-------------End Change Impact Analysis---------------");
	}

}
