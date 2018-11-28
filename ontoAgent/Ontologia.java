package conexionOntology;

import jade.content.onto.*;
import jade.content.schema.*;

public class Ontologia extends Ontology {
	// El nombre identificando esta ontología
	public static final String ONTOLOGY_NAME = "ontología de conexión";

	// Vocabulario
	public static final String URL_ = "Url";
	public static final String URL_IP = "ip";
	public static final String URL_PUERTO = "puerto";

	public static final String CONEXIONA = "ConexionA";
	public static final String CONEXIONA_URL = "url";

	public static final String CONECTA = "Conecta";
	public static final String CONECTA_URL = "url";

	// La instancia de esta ontología
	private static Ontology laInstancia = new Ontologia();

	// Método para acceder a la instancia de la ontología
	public static Ontology getInstance() {
		return laInstancia;
	}

	// Constructor privado
	private Ontologia() {
		// la conexionOntolgy extiende la ontología básica
		super(ONTOLOGY_NAME, BasicOntology.getInstance());

		try {
			add(new ConceptSchema(URL_), Url.class);
			add(new PredicateSchema(CONEXIONA), ConexionA.class);
			add(new AgentActionSchema(CONECTA), Conecta.class);

			// Estructura del esquema para el concepto URL_
			ConceptSchema cs = (ConceptSchema) getSchema(URL_);
			cs.add(URL_IP, (PrimitiveSchema) getSchema(BasicOntology.STRING),
				ObjectSchema.OPTIONAL);
			cs.add(URL_PUERTO, (PrimitiveSchema) getSchema(BasicOntology.INTEGER));

			// Estructura del esquema para el predicado CONEXIONA
			PredicateSchema ps = (PredicateSchema) getSchema(CONEXIONA);
			ps.add(CONEXIONA_URL, (ConceptSchema) getSchema(URL_));

			// Estructura del esquema para la acción CONECTA
			AgentActionSchema as = (AgentActionSchema) getSchema(CONECTA);
			as.add(CONECTA_URL, (ConceptSchema) getSchema(URL_));
		}
		catch (OntologyException oe) {
			oe.printStackTrace();
		}
	}
}
