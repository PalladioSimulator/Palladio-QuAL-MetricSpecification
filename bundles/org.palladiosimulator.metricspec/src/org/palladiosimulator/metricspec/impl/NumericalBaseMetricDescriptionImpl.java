/**
 */
package org.palladiosimulator.metricspec.impl;

import javax.measure.quantity.Quantity;
import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.NumericalBaseMetricDescription;
import org.palladiosimulator.metricspec.PersistenceKindOptions;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Numerical Base Metric Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.metricspec.impl.NumericalBaseMetricDescriptionImpl#getDefaultUnit
 * <em>Default Unit</em>}</li>
 * <li>
 * {@link org.palladiosimulator.metricspec.impl.NumericalBaseMetricDescriptionImpl#getPersistenceKind
 * <em>Persistence Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericalBaseMetricDescriptionImpl extends BaseMetricDescriptionImpl
        implements NumericalBaseMetricDescription {

    /**
     * The default value of the '{@link #getPersistenceKind() <em>Persistence Kind</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getPersistenceKind()
     * @generated
     * @ordered
     */
    protected static final PersistenceKindOptions PERSISTENCE_KIND_EDEFAULT = PersistenceKindOptions.BINARY_PREFERRED;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected NumericalBaseMetricDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricSpecPackage.Literals.NUMERICAL_BASE_METRIC_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Unit<Quantity> getDefaultUnit() {
        return (Unit<Quantity>) this.eDynamicGet(MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT,
                MetricSpecPackage.Literals.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDefaultUnit(final Unit<Quantity> newDefaultUnit) {
        this.eDynamicSet(MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT,
                MetricSpecPackage.Literals.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT, newDefaultUnit);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public PersistenceKindOptions getPersistenceKind() {
        return (PersistenceKindOptions) this.eDynamicGet(
                MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND,
                MetricSpecPackage.Literals.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setPersistenceKind(final PersistenceKindOptions newPersistenceKind) {
        this.eDynamicSet(MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND,
                MetricSpecPackage.Literals.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND, newPersistenceKind);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT:
            return this.getDefaultUnit();
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND:
            return this.getPersistenceKind();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT:
            this.setDefaultUnit((Unit<Quantity>) newValue);
            return;
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND:
            this.setPersistenceKind((PersistenceKindOptions) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT:
            this.setDefaultUnit((Unit<Quantity>) null);
            return;
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND:
            this.setPersistenceKind(PERSISTENCE_KIND_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__DEFAULT_UNIT:
            return this.getDefaultUnit() != null;
        case MetricSpecPackage.NUMERICAL_BASE_METRIC_DESCRIPTION__PERSISTENCE_KIND:
            return this.getPersistenceKind() != PERSISTENCE_KIND_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // NumericalBaseMetricDescriptionImpl
