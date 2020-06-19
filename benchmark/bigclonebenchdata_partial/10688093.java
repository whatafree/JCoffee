


class c10688093 {

    public final InputStream getStreamFromUrl(final URL url) {
        try {
            if (listener != null) {
                listener.openedStream(url);
            }
            return url.openStream();
        } catch (IOException e) {
            listener.exceptionThrown(e);
            return null;
        }
    }

}
