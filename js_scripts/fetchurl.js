var rssFeed = 'http://services.explorecalifornia.org/rss/tours.php';
var url = new java.net.URL(rssFeed);
input = new java.util.Scanner(url.openStream());
input.useDelimiter('$');
var contents = input.next();
contents;