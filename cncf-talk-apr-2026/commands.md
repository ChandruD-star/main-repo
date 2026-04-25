# Install Kubescape

```
helm repo add kubescape https://kubescape.github.io/helm-charts/ ; helm repo update ; helm upgrade --install kubescape kubescape/kubescape-operator -n kubescape --create-namespace --set clusterName=`kubectl config current-context` --set capabilities.continuousScan=enable
```

# Framework scans

```
kubescape scan framework <framework>
```

# Scan local YAML/JSON files before deploying:

```
kubescape scan *.yaml
```

# Scanning images

```
kubescape scan image nginx:latest
```




