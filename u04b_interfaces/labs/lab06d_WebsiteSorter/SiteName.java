//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

class SiteName implements Comparable<SiteName>
{
    private String name;
    private String category;

    public SiteName(String site)
    {
        name = site.substring(0, site.indexOf("."));
        category = site.substring(site.indexOf(".") + 1);
    }

    public int compareTo(SiteName other)
    {
        if (!category.equals(other.category))
            return category.compareTo(other.category);

        return name.compareTo(other.name);
    }

    public String toString()
    {
        return name + "." + category;
    }
}




