/**
 */
package org.mcmaster.requirements_modelling.rmdl.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.viewpoint.RGBValues;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.mcmaster.requirements_modelling.rmdl.DesignElement;
import org.mcmaster.requirements_modelling.rmdl.Requirement_Diagram;
import org.mcmaster.requirements_modelling.rmdl.Requirements;
import org.mcmaster.requirements_modelling.rmdl.Review;
import org.mcmaster.requirements_modelling.rmdl.RmdlPackage;
import org.mcmaster.requirements_modelling.rmdl.TestCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getID <em>ID</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getRequirement_root <em>Requirement root</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getReview <em>Review</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getTestcase <em>Testcase</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getTraceto <em>Traceto</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getPartof <em>Partof</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getDecomposesto <em>Decomposesto</em>}</li>
 *   <li>{@link org.mcmaster.requirements_modelling.rmdl.impl.RequirementsImpl#getSpecification <em>Specification</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementsImpl extends MinimalEObjectImpl.Container implements Requirements {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReview() <em>Review</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReview()
	 * @generated
	 * @ordered
	 */
	protected EList<Review> review;

	/**
	 * The cached value of the '{@link #getTestcase() <em>Testcase</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestcase()
	 * @generated
	 * @ordered
	 */
	protected EList<TestCase> testcase;

	/**
	 * The cached value of the '{@link #getTraceto() <em>Traceto</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceto()
	 * @generated
	 * @ordered
	 */
	protected EList<DesignElement> traceto;

	/**
	 * The cached value of the '{@link #getPartof() <em>Partof</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartof()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirements> partof;

	/**
	 * The cached value of the '{@link #getDecomposesto() <em>Decomposesto</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposesto()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirements> decomposesto;

	/**
	 * The default value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected static final String SPECIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected String specification = SPECIFICATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmdlPackage.Literals.REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENTS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENTS__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENTS__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Diagram getRequirement_root() {
		if (eContainerFeatureID() != RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT)
			return null;
		return (Requirement_Diagram) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement_root(Requirement_Diagram newRequirement_root, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRequirement_root, RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequirement_root(Requirement_Diagram newRequirement_root) {
		if (newRequirement_root != eInternalContainer()
				|| (eContainerFeatureID() != RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT
						&& newRequirement_root != null)) {
			if (EcoreUtil.isAncestor(this, newRequirement_root))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRequirement_root != null)
				msgs = ((InternalEObject) newRequirement_root).eInverseAdd(this,
						RmdlPackage.REQUIREMENT_DIAGRAM__REQUIREMENTS, Requirement_Diagram.class, msgs);
			msgs = basicSetRequirement_root(newRequirement_root, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT,
					newRequirement_root, newRequirement_root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Review> getReview() {
		if (review == null) {
			review = new EObjectWithInverseResolvingEList.ManyInverse<Review>(Review.class, this,
					RmdlPackage.REQUIREMENTS__REVIEW, RmdlPackage.REVIEW__REQUIREMENTS);
		}
		return review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TestCase> getTestcase() {
		if (testcase == null) {
			testcase = new EObjectWithInverseResolvingEList.ManyInverse<TestCase>(TestCase.class, this,
					RmdlPackage.REQUIREMENTS__TESTCASE, RmdlPackage.TEST_CASE__REQUIREMENTS);
		}
		return testcase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DesignElement> getTraceto() {
		if (traceto == null) {
			traceto = new EObjectWithInverseResolvingEList.ManyInverse<DesignElement>(DesignElement.class, this,
					RmdlPackage.REQUIREMENTS__TRACETO, RmdlPackage.DESIGN_ELEMENT__TRACEFROM);
		}
		return traceto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirements> getPartof() {
		if (partof == null) {
			partof = new EObjectWithInverseResolvingEList.ManyInverse<Requirements>(Requirements.class, this,
					RmdlPackage.REQUIREMENTS__PARTOF, RmdlPackage.REQUIREMENTS__DECOMPOSESTO);
		}
		return partof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirements> getDecomposesto() {
		if (decomposesto == null) {
			decomposesto = new EObjectWithInverseResolvingEList.ManyInverse<Requirements>(Requirements.class, this,
					RmdlPackage.REQUIREMENTS__DECOMPOSESTO, RmdlPackage.REQUIREMENTS__PARTOF);
		}
		return decomposesto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(String newSpecification) {
		String oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmdlPackage.REQUIREMENTS__SPECIFICATION,
					oldSpecification, specification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * This is the method implementation of a change impact analysis. This is to be used as a predictive measure of the impact that can occur due to a change in requirements.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeImpactAnalysis() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		// throw new UnsupportedOperationException();
		EList<DesignElement> dElements = this.traceto;
		EList<Review> reviews = this.review;
		EList<TestCase> testcases = this.testcase;
		for (DesignElement d : dElements) {
			System.out.println(d);
			Collection<EObject> tempNode = new EObjectQuery(d)
					.getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
			//			DSemanticDecorator tempNode = (DSemanticDecorator) d;
			System.out.println(tempNode.toArray()[0]);
			RGBValues newBorderColor = RGBValues.create(255, 0, 0);
			((DNode) tempNode.toArray()[0]).getOwnedStyle().setBorderColor(newBorderColor);
			((DNode) tempNode.toArray()[0]).getOwnedStyle().getCustomFeatures()
					.add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
		}

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetRequirement_root((Requirement_Diagram) otherEnd, msgs);
		case RmdlPackage.REQUIREMENTS__REVIEW:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getReview()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENTS__TESTCASE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTestcase()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENTS__TRACETO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTraceto()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENTS__PARTOF:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPartof()).basicAdd(otherEnd, msgs);
		case RmdlPackage.REQUIREMENTS__DECOMPOSESTO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getDecomposesto()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT:
			return basicSetRequirement_root(null, msgs);
		case RmdlPackage.REQUIREMENTS__REVIEW:
			return ((InternalEList<?>) getReview()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENTS__TESTCASE:
			return ((InternalEList<?>) getTestcase()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENTS__TRACETO:
			return ((InternalEList<?>) getTraceto()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENTS__PARTOF:
			return ((InternalEList<?>) getPartof()).basicRemove(otherEnd, msgs);
		case RmdlPackage.REQUIREMENTS__DECOMPOSESTO:
			return ((InternalEList<?>) getDecomposesto()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT:
			return eInternalContainer().eInverseRemove(this, RmdlPackage.REQUIREMENT_DIAGRAM__REQUIREMENTS,
					Requirement_Diagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case RmdlPackage.REQUIREMENTS__NAME:
			return getName();
		case RmdlPackage.REQUIREMENTS__ID:
			return getID();
		case RmdlPackage.REQUIREMENTS__DESCRIPTION:
			return getDescription();
		case RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT:
			return getRequirement_root();
		case RmdlPackage.REQUIREMENTS__REVIEW:
			return getReview();
		case RmdlPackage.REQUIREMENTS__TESTCASE:
			return getTestcase();
		case RmdlPackage.REQUIREMENTS__TRACETO:
			return getTraceto();
		case RmdlPackage.REQUIREMENTS__PARTOF:
			return getPartof();
		case RmdlPackage.REQUIREMENTS__DECOMPOSESTO:
			return getDecomposesto();
		case RmdlPackage.REQUIREMENTS__SPECIFICATION:
			return getSpecification();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RmdlPackage.REQUIREMENTS__NAME:
			setName((String) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__ID:
			setID((Integer) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT:
			setRequirement_root((Requirement_Diagram) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__REVIEW:
			getReview().clear();
			getReview().addAll((Collection<? extends Review>) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__TESTCASE:
			getTestcase().clear();
			getTestcase().addAll((Collection<? extends TestCase>) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__TRACETO:
			getTraceto().clear();
			getTraceto().addAll((Collection<? extends DesignElement>) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__PARTOF:
			getPartof().clear();
			getPartof().addAll((Collection<? extends Requirements>) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__DECOMPOSESTO:
			getDecomposesto().clear();
			getDecomposesto().addAll((Collection<? extends Requirements>) newValue);
			return;
		case RmdlPackage.REQUIREMENTS__SPECIFICATION:
			setSpecification((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case RmdlPackage.REQUIREMENTS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENTS__ID:
			setID(ID_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENTS__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT:
			setRequirement_root((Requirement_Diagram) null);
			return;
		case RmdlPackage.REQUIREMENTS__REVIEW:
			getReview().clear();
			return;
		case RmdlPackage.REQUIREMENTS__TESTCASE:
			getTestcase().clear();
			return;
		case RmdlPackage.REQUIREMENTS__TRACETO:
			getTraceto().clear();
			return;
		case RmdlPackage.REQUIREMENTS__PARTOF:
			getPartof().clear();
			return;
		case RmdlPackage.REQUIREMENTS__DECOMPOSESTO:
			getDecomposesto().clear();
			return;
		case RmdlPackage.REQUIREMENTS__SPECIFICATION:
			setSpecification(SPECIFICATION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case RmdlPackage.REQUIREMENTS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case RmdlPackage.REQUIREMENTS__ID:
			return id != ID_EDEFAULT;
		case RmdlPackage.REQUIREMENTS__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case RmdlPackage.REQUIREMENTS__REQUIREMENT_ROOT:
			return getRequirement_root() != null;
		case RmdlPackage.REQUIREMENTS__REVIEW:
			return review != null && !review.isEmpty();
		case RmdlPackage.REQUIREMENTS__TESTCASE:
			return testcase != null && !testcase.isEmpty();
		case RmdlPackage.REQUIREMENTS__TRACETO:
			return traceto != null && !traceto.isEmpty();
		case RmdlPackage.REQUIREMENTS__PARTOF:
			return partof != null && !partof.isEmpty();
		case RmdlPackage.REQUIREMENTS__DECOMPOSESTO:
			return decomposesto != null && !decomposesto.isEmpty();
		case RmdlPackage.REQUIREMENTS__SPECIFICATION:
			return SPECIFICATION_EDEFAULT == null ? specification != null
					: !SPECIFICATION_EDEFAULT.equals(specification);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", ID: ");
		result.append(id);
		result.append(", description: ");
		result.append(description);
		result.append(", specification: ");
		result.append(specification);
		result.append(')');
		return result.toString();
	}

} //RequirementsImpl
