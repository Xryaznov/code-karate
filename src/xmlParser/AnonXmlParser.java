package xmlParser;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnonXmlParser implements AnonParser {
    Map<String, String> map;
    Document doc;

    @Override
    public Set<String> getAttributes(File file) {
        map = new HashMap<>();
        try {
            DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            doc = dBuilder.parse(file);
            if (doc.hasChildNodes()) {
                addAttributesToMap(doc.getChildNodes());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return map.keySet();
    }

    @Override
    public String getAttributeValues(String attr) {
        return map.get(attr);
    }

    private void addAttributesToMap(NodeList childNodes) {
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node temp = childNodes.item(i);

            if (temp.getNodeType() == Node.ELEMENT_NODE) {
                if (temp.hasAttributes()) {
                    NamedNodeMap nodeMap = temp.getAttributes();
                    for (int j = 0; j < nodeMap.getLength(); j++) {
                        Node node = nodeMap.item(j);
                        map.put(node.getNodeName(), TextValue(node));
                    }
                }
            }

            if (temp.hasChildNodes()) {
                addAttributesToMap(temp.getChildNodes());
            }
        }
    }

    private String TextValue(Node node) {
        String res;
        if (map.containsKey(node.getNodeName())) {
            res = map.get(node.getNodeName()) + node.getNodeValue() + "\n";
        } else {
            res = node.getNodeValue() + "\n";
        }
        return res;
    }
}

