/**
 */
package bowling;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.Tournament#getMachups <em>Machups</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getTournament()
 * @model
 * @generated
 */
public interface Tournament extends EObject {

	/**
	 * Returns the value of the '<em><b>Machups</b></em>' containment reference list.
	 * The list contents are of type {@link bowling.Machup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Machups</em>' containment reference list.
	 * @see bowling.BowlingPackage#getTournament_Machups()
	 * @model containment="true"
	 * @generated
	 */
	EList<Machup> getMachups();
} // Tournament
