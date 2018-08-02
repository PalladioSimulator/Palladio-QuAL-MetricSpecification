/**
 */
package org.palladiosimulator.metricspec.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricDescriptionRepository;
import org.palladiosimulator.metricspec.MetricSpecPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Metric Description</b></em>
 * '. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.impl.MetricDescriptionImpl#getRepository
 * <em>Repository</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MetricDescriptionImpl extends DescriptionImpl implements MetricDescription {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MetricDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricSpecPackage.Literals.METRIC_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public MetricDescriptionRepository getRepository() {
        return (MetricDescriptionRepository) this.eDynamicGet(MetricSpecPackage.METRIC_DESCRIPTION__REPOSITORY,
                MetricSpecPackage.Literals.METRIC_DESCRIPTION__REPOSITORY, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetRepository(final MetricDescriptionRepository newRepository,
            NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newRepository,
                MetricSpecPackage.METRIC_DESCRIPTION__REPOSITORY, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setRepository(final MetricDescriptionRepository newRepository) {
        this.eDynamicSet(MetricSpecPackage.METRIC_DESCRIPTION__REPOSITORY,
                MetricSpecPackage.Literals.METRIC_DESCRIPTION__REPOSITORY, newRepository);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case MetricSpecPackage.METRIC_DESCRIPTION__REPOSITORY:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetRepository((MetricDescriptionRepository) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case MetricSpecPackage.METRIC_DESCRIPTION__REPOSITORY:
            return this.basicSetRepository(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
        switch (this.eContainerFeatureID()) {
        case MetricSpecPackage.METRIC_DESCRIPTION__REPOSITORY:
            return this.eInternalContainer().eInverseRemove(this,
                    MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS,
                    MetricDescriptionRepository.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MetricSpecPackage.METRIC_DESCRIPTION__REPOSITORY:
            return this.getRepository();
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
        case MetricSpecPackage.METRIC_DESCRIPTION__REPOSITORY:
            this.setRepository((MetricDescriptionRepository) newValue);
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
        case MetricSpecPackage.METRIC_DESCRIPTION__REPOSITORY:
            this.setRepository((MetricDescriptionRepository) null);
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
        case MetricSpecPackage.METRIC_DESCRIPTION__REPOSITORY:
            return this.getRepository() != null;
        }
        return super.eIsSet(featureID);
    }

} // MetricDescriptionImpl
