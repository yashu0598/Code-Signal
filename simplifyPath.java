String simplifyPath(String path) {
    List<String> paths = new ArrayList<>();
        int prev = -1;
        for(int i = 0 ; i < path.length() + 1 ; i++) {
            if (i == path.length() || path.charAt(i) == '/') {
                String token = path.substring(prev + 1, i);
                prev = i;
                switch(token) {
                        case "":
                        case ".":
                            break;
                        case "..":
                            if (!paths.isEmpty()) {
                                paths.remove(paths.size() - 1);
                            }
                            break;                                
                        default:
                            paths.add(token);                        
                }
            } 
        }
        if (paths.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < paths.size() ; i++) {
            sb.append("/");
            sb.append(paths.get(i));
        }
        return sb.toString();
}
