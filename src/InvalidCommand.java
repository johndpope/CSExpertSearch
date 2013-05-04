import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;

/**
 * Invalid command
 * @author chethans
 */
public class InvalidCommand implements Command
{
	public void execute() throws SolrServerException, IOException
	{
		System.out.println("Not a valid command. Exiting!!!");				
		System.exit(-1);
	}
}
