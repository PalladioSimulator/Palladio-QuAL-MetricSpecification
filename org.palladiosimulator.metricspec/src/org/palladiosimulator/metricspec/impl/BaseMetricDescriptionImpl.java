/**
 */
package org.palladiosimulator.metricspec.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.CaptureType;
import org.palladiosimulator.metricspec.DataType;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.Scale;
import org.palladiosimulator.metricspec.ScopeOfValidity;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Base Metric Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.impl.BaseMetricDescriptionImpl#getCaptureType
 * <em>Capture Type</em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.impl.BaseMetricDescriptionImpl#getDataType
 * <em>Data Type</em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.impl.BaseMetricDescriptionImpl#getScale
 * <em>Scale</em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.impl.BaseMetricDescriptionImpl#getScopeOfValidity
 * <em>Scope Of Validity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BaseMetricDescriptionImpl extends MetricDescriptionImpl implements BaseMetricDescription {

    /**
     * The default value of the '{@link #getCaptureType() <em>Capture Type</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getCaptureType()
     * @generated
     * @ordered
     */
    protected static final CaptureType CAPTURE_TYPE_EDEFAULT = CaptureType.IDENTIFIER;

    /**
     * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected static final DataType DATA_TYPE_EDEFAULT = DataType.QUANTITATIVE;

    /**
     * The default value of the '{@link #getScale() <em>Scale</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @see #getScale()
     * @generated
     * @ordered
     */
    protected static final Scale SCALE_EDEFAULT = Scale.NOMINAL;

    /**
     * The default value of the '{@link #getScopeOfValidity() <em>Scope Of Validity</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getScopeOfValidity()
     * @generated
     * @ordered
     */
    protected static final ScopeOfValidity SCOPE_OF_VALIDITY_EDEFAULT = ScopeOfValidity.DISCRETE;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected BaseMetricDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricSpecPackage.Literals.BASE_METRIC_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public CaptureType getCaptureType() {
        return (CaptureType) this.eDynamicGet(MetricSpecPackage.BASE_METRIC_DESCRIPTION__CAPTURE_TYPE,
                MetricSpecPackage.Literals.BASE_METRIC_DESCRIPTION__CAPTURE_TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setCaptureType(final CaptureType newCaptureType) {
        this.eDynamicSet(MetricSpecPackage.BASE_METRIC_DESCRIPTION__CAPTURE_TYPE,
                MetricSpecPackage.Literals.BASE_METRIC_DESCRIPTION__CAPTURE_TYPE, newCaptureType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public DataType getDataType() {
        return (DataType) this.eDynamicGet(MetricSpecPackage.BASE_METRIC_DESCRIPTION__DATA_TYPE,
                MetricSpecPackage.Literals.BASE_METRIC_DESCRIPTION__DATA_TYPE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setDataType(final DataType newDataType) {
        this.eDynamicSet(MetricSpecPackage.BASE_METRIC_DESCRIPTION__DATA_TYPE,
                MetricSpecPackage.Literals.BASE_METRIC_DESCRIPTION__DATA_TYPE, newDataType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Scale getScale() {
        return (Scale) this.eDynamicGet(MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCALE,
                MetricSpecPackage.Literals.BASE_METRIC_DESCRIPTION__SCALE, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setScale(final Scale newScale) {
        this.eDynamicSet(MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCALE,
                MetricSpecPackage.Literals.BASE_METRIC_DESCRIPTION__SCALE, newScale);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public ScopeOfValidity getScopeOfValidity() {
        return (ScopeOfValidity) this.eDynamicGet(MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCOPE_OF_VALIDITY,
                MetricSpecPackage.Literals.BASE_METRIC_DESCRIPTION__SCOPE_OF_VALIDITY, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setScopeOfValidity(final ScopeOfValidity newScopeOfValidity) {
        this.eDynamicSet(MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCOPE_OF_VALIDITY,
                MetricSpecPackage.Literals.BASE_METRIC_DESCRIPTION__SCOPE_OF_VALIDITY, newScopeOfValidity);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__CAPTURE_TYPE:
            return this.getCaptureType();
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__DATA_TYPE:
            return this.getDataType();
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCALE:
            return this.getScale();
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCOPE_OF_VALIDITY:
            return this.getScopeOfValidity();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__CAPTURE_TYPE:
            this.setCaptureType((CaptureType) newValue);
            return;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__DATA_TYPE:
            this.setDataType((DataType) newValue);
            return;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCALE:
            this.setScale((Scale) newValue);
            return;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCOPE_OF_VALIDITY:
            this.setScopeOfValidity((ScopeOfValidity) newValue);
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
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__CAPTURE_TYPE:
            this.setCaptureType(CAPTURE_TYPE_EDEFAULT);
            return;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__DATA_TYPE:
            this.setDataType(DATA_TYPE_EDEFAULT);
            return;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCALE:
            this.setScale(SCALE_EDEFAULT);
            return;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCOPE_OF_VALIDITY:
            this.setScopeOfValidity(SCOPE_OF_VALIDITY_EDEFAULT);
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
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__CAPTURE_TYPE:
            return this.getCaptureType() != CAPTURE_TYPE_EDEFAULT;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__DATA_TYPE:
            return this.getDataType() != DATA_TYPE_EDEFAULT;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCALE:
            return this.getScale() != SCALE_EDEFAULT;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCOPE_OF_VALIDITY:
            return this.getScopeOfValidity() != SCOPE_OF_VALIDITY_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

} // BaseMetricDescriptionImpl
