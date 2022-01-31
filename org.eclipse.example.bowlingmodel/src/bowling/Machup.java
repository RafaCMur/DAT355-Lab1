/**
 */
package bowling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bowling.Machup#getGames <em>Games</em>}</li>
 * </ul>
 *
 * @see bowling.BowlingPackage#getMachup()
 * @model
 * @generated
 */
public interface Machup extends EObject {
	/**
	 * Returns the value of the '<em><b>Games</b></em>' containment reference list.
	 * The list contents are of type {@link bowling.Game}.
	 * It is bidirectional and its opposite is '{@link bowling.Game#getMachup <em>Machup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Games</em>' containment reference list.
	 * @see bowling.BowlingPackage#getMachup_Games()
	 * @see bowling.Game#getMachup
	 * @model opposite="machup" containment="true" upper="2"
	 * @generated
	 */
	EList<Game> getGames();

} // Machup
