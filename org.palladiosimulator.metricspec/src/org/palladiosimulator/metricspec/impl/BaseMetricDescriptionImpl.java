/**
 */
package org.palladiosimulator.metricspec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.palladiosimulator.metricspec.BaseMetricDescription;
import org.palladiosimulator.metricspec.CaptureType;
import org.palladiosimulator.metricspec.DataType;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.Scale;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Base Metric Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.impl.BaseMetricDescriptionImpl#getCaptureType <em>
 * Capture Type</em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.impl.BaseMetricDescriptionImpl#getDataType <em>Data
 * Type</em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.impl.BaseMetricDescriptionImpl#getScale <em>Scale
 * </em>}</li>
 * </ul>
 * </p>
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
     * The cached value of the '{@link #getCaptureType() <em>Capture Type</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getCaptureType()
     * @generated
     * @ordered
     */
    protected CaptureType captureType = CAPTURE_TYPE_EDEFAULT;

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
     * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getDataType()
     * @generated
     * @ordered
     */
    protected DataType dataType = DATA_TYPE_EDEFAULT;

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
     * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getScale()
     * @generated
     * @ordered
     */
    protected Scale scale = SCALE_EDEFAULT;

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
        return this.captureType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setCaptureType(final CaptureType newCaptureType) {
        final CaptureType oldCaptureType = this.captureType;
        this.captureType = newCaptureType == null ? CAPTURE_TYPE_EDEFAULT : newCaptureType;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    MetricSpecPackage.BASE_METRIC_DESCRIPTION__CAPTURE_TYPE, oldCaptureType, this.captureType));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public DataType getDataType() {
        return this.dataType;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setDataType(final DataType newDataType) {
        final DataType oldDataType = this.dataType;
        this.dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    MetricSpecPackage.BASE_METRIC_DESCRIPTION__DATA_TYPE, oldDataType, this.dataType));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Scale getScale() {
        return this.scale;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setScale(final Scale newScale) {
        final Scale oldScale = this.scale;
        this.scale = newScale == null ? SCALE_EDEFAULT : newScale;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCALE, oldScale, this.scale));
        }
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
            return this.captureType != CAPTURE_TYPE_EDEFAULT;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__DATA_TYPE:
            return this.dataType != DATA_TYPE_EDEFAULT;
        case MetricSpecPackage.BASE_METRIC_DESCRIPTION__SCALE:
            return this.scale != SCALE_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (captureType: ");
        result.append(this.captureType);
        result.append(", dataType: ");
        result.append(this.dataType);
        result.append(", scale: ");
        result.append(this.scale);
        result.append(')');
        return result.toString();
    }

} // BaseMetricDescriptionImpl
