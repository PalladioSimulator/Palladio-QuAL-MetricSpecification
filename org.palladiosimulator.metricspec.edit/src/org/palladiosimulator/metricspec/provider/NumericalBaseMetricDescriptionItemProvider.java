/**
 */
package org.palladiosimulator.metricspec.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;

/**
 * This is the item provider adapter for a
 * {@link org.palladiosimulator.metricspec.NumericalBaseMetricDescription} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class NumericalBaseMetricDescriptionItemProvider extends BaseMetricDescriptionItemProvider {

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    public NumericalBaseMetricDescriptionItemProvider(final AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(final Object object) {
        if (this.itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            this.addDefaultUnitPropertyDescriptor(object);
            this.addPersistenceKindPropertyDescriptor(object);
        }
        return this.itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Default Unit feature. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     */
    protected void addDefaultUnitPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_NumericalBaseMetricDescription_defaultUnit_feature"), this.getString(
                        "_UI_PropertyDescriptor_description", "_UI_NumericalBaseMetricDescription_defaultUnit_feature",
                        "_UI_NumericalBaseMetricDescription_type"),
                MetricSpecPackage.Literals.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This adds a property descriptor for the Persistence Kind feature. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     */
    protected void addPersistenceKindPropertyDescriptor(final Object object) {
        this.itemPropertyDescriptors.add(this.createItemPropertyDescriptor(
                ((ComposeableAdapterFactory) this.adapterFactory).getRootAdapterFactory(), this.getResourceLocator(),
                this.getString("_UI_NumericalBaseMetricDescription_persistenceKind_feature"), this.getString(
                        "_UI_PropertyDescriptor_description",
                        "_UI_NumericalBaseMetricDescription_persistenceKind_feature",
                        "_UI_NumericalBaseMetricDescription_type"),
                MetricSpecPackage.Literals.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND, true, false, false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
    }

    /**
     * This returns NumericalBaseMetricDescription.gif. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public Object getImage(final Object object) {
        return this.overlayImage(object, this.getResourceLocator()
                .getImage("full/obj16/NumericalBaseMetricDescription"));
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     *
     * @generated
     */
    @Override
    public String getText(final Object object) {
        final String label = ((NumericalBaseMetricDescription) object).getName();
        return label == null || label.length() == 0 ? this.getString("_UI_NumericalBaseMetricDescription_type") : this
                .getString("_UI_NumericalBaseMetricDescription_type") + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}
     * . <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void notifyChanged(final Notification notification) {
        this.updateChildren(notification);

        switch (notification.getFeatureID(NumericalBaseMetricDescription.class)) {
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT:
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND:
            this.fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
            return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that
     * can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(final Collection<Object> newChildDescriptors, final Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);
    }

}
