/**
 */
package org.mcmaster.pfcsm.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mcmaster.pfcsm.Class_Diagram_Root;
import org.mcmaster.pfcsm.PfcsmFactory;
import org.mcmaster.pfcsm.PfcsmPackage;

/**
 * This is the item provider adapter for a {@link org.mcmaster.pfcsm.Class_Diagram_Root} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Class_Diagram_RootItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class_Diagram_RootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addReferencePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Class_Diagram_Root_reference_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Class_Diagram_Root_reference_feature",
								"_UI_Class_Diagram_Root_type"),
						PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__REFERENCE, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__DESIGNENTITY);
			childrenFeatures.add(PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__REFERENCE);
			childrenFeatures.add(PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__HARDWARE);
			childrenFeatures.add(PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__SOFTWARE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Class_Diagram_Root.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Class_Diagram_Root"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Class_Diagram_Root_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Class_Diagram_Root.class)) {
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__DESIGNENTITY:
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__REFERENCE:
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__HARDWARE:
		case PfcsmPackage.CLASS_DIAGRAM_ROOT__SOFTWARE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__DESIGNENTITY,
				PfcsmFactory.eINSTANCE.createDesignEntity()));

		newChildDescriptors.add(createChildParameter(PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__DESIGNENTITY,
				PfcsmFactory.eINSTANCE.createHardware()));

		newChildDescriptors.add(createChildParameter(PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__DESIGNENTITY,
				PfcsmFactory.eINSTANCE.createSoftware()));

		newChildDescriptors.add(createChildParameter(PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__REFERENCE,
				PfcsmFactory.eINSTANCE.createUses()));

		newChildDescriptors.add(createChildParameter(PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__REFERENCE,
				PfcsmFactory.eINSTANCE.createComposition()));

		newChildDescriptors.add(createChildParameter(PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__REFERENCE,
				PfcsmFactory.eINSTANCE.createProduces()));

		newChildDescriptors.add(createChildParameter(PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__REFERENCE,
				PfcsmFactory.eINSTANCE.createAggregation()));

		newChildDescriptors.add(createChildParameter(PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__REFERENCE,
				PfcsmFactory.eINSTANCE.createAlternative()));

		newChildDescriptors.add(createChildParameter(PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__HARDWARE,
				PfcsmFactory.eINSTANCE.createHardware()));

		newChildDescriptors.add(createChildParameter(PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__SOFTWARE,
				PfcsmFactory.eINSTANCE.createSoftware()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__DESIGNENTITY
				|| childFeature == PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__HARDWARE
				|| childFeature == PfcsmPackage.Literals.CLASS_DIAGRAM_ROOT__SOFTWARE;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PfcsmEditPlugin.INSTANCE;
	}

}
